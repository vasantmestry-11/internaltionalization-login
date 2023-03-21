import { useReducer } from "react";
import { useTranslation } from "react-i18next";
import { useNavigate } from "react-router-dom";
import formReducer from "../../reducers/formReducer";
import { getData } from "../../services/getData";
import "./Login.css";

const initialState = {
  username: "",
  password: "",
};

const Login = () => {
  const { t } = useTranslation();
  const navigate = useNavigate();

  const [formState, dispatch] = useReducer(formReducer, initialState);
  const { username, password } = formState;

  const handleChange = (e) => {
    const { name, value } = e.target;
    dispatch({
      type: "INPUT_CHANGE",
      field: name,
      payload: value,
    });
  };

  const loginHandler = async () => {
    const isFetched = await getData({
      username,
      password,
    });
    if (isFetched.status === 202) {
      navigate("/dashboard");
    }
  };

  return (
    <div className="login-card card d-flex flex-column">
      <div className="card-body">
        <h5 className="card-title text-center mb-4">{t("login_card_title")}</h5>
        <div className="mb-3">
          <input
            type="text"
            className="form-control form-control-sm"
            placeholder={t("username")}
            name="username"
            value={username}
            onChange={handleChange}
          />
        </div>
        <div className="mb-3">
          <input
            type="password"
            name="password"
            className="form-control form-control-sm"
            placeholder={t("password")}
            value={password}
            onChange={handleChange}
          />
        </div>
        <button
          className="btn btn-outline-success w-100 btn-sm"
          onClick={loginHandler}
        >
          {t("login_btn_text")}
        </button>
      </div>
    </div>
  );
};

export default Login;
