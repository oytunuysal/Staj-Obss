import React from "react";
import { getUsers } from "./util/UserService";

class App extends React.Component {
  state = {
    users: [],
    isLoading: true,
    error: null
  };

  componentDidMount() {
    getUsers()
      .then((users) => {
        this.setState({
          users,
          isLoading: false
        });
      })
      .catch((error) => this.setState({ error, isLoading: false }));
  }

  render() {
    const { isLoading, users, error } = this.state;
    return (
      <React.Fragment>
        <h2>User List</h2>

        <div>
          {!isLoading ? (
            error ? (
              `An error occured: ${error}`
            ) : (
              users.map((user) => {
                const { username, name, email, image } = user;
                return (
                  <div key={username}>
                    <p>{name}</p>
                    <div>
                      <img src={image} alt={name} />
                    </div>
                    <p>{email}</p>
                    <hr />
                  </div>
                );
              })
            )
          ) : (
            <p>Loading...</p>
          )}
        </div>
      </React.Fragment>
    );

    /*
        getUsers().then((users) => {
      users.map((user) => {
        this.setState({
          name: user.name,
          username: user.username,
          email: user.email
        });
        return "asd";
      });
    });
    return (
      <div>
        {this.state.name} {this.state.username} {this.state.email}
      </div>
    );
    */
  }
}

export default App;
