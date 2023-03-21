import { useTranslation } from "react-i18next";
import { useNavigate } from "react-router-dom";
import { getData } from "../../services/getData";
import "./Login.css";

const Login = () => {
  const { t } = useTranslation();
  const navigate = useNavigate();

  const loginHandler = async () => {
    const isFetched = await getData();
    if (isFetched.status === 200) {
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
          />
        </div>
        <div className="mb-3">
          <input
            type="password"
            className="form-control form-control-sm"
            placeholder={t("password")}
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
