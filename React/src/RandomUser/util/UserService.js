import axios from "axios";

export const getUsers = () => {
  return axios.get("https://randomuser.me/api/?results=1").then((response) => {
    return response.data.results.map((user) => ({
      name: user.name.first + "" + user.name.last,
      username: user.login.username,
      email: user.email,
      image: user.picture.thumbnail
    }));
  });
};
