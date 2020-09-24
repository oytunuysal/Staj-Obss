import React from "react";
import ReactDOM from "react-dom";
import RenderingExample from "./re-rendering/index";
import ShoppingApp from "./Shopping/ShoppingApp";
//import TransportationApp from "./Transportation/TransportationApp";
//import RandomUser from "./RandomUser/App";
//import AxiosFetchExample from "./RandomUser/index";

//import App from "./App";

const rootElement = document.getElementById("root");
//ReactDOM.render(<h1>Hello JS</h1>, rootElement);
ReactDOM.render(<ShoppingApp />, rootElement);

//RenderingExample(rootElement);
//ReactDOM.render(<TransportationApp />, rootElement);

//ReactDOM.render(<RandomUser />, rootElement);
//AxiosFetchExample();
