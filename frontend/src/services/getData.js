import axios from "axios";

export const getData = async () => {
  const data = await axios
    .get("https://jsonplaceholder.typicode.com/posts/1")
    .then((res) => res);

  return data;
};
