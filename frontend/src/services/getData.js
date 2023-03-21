import axios from "axios";

export const getData = async ({ username, password }) => {
  const data = await axios
    .post("http://localhost:8080/login", {
      username,
      password,
    })
    .then((res) => res);

  return data;
};
