import React from "react";
import ReactDOM from "react-dom";
import CounterComponent from "./CounterComponent";

export default function () {
  setInterval(incrementCounter, 1000);
}

let counter = 0;

function incrementCounter() {
  ReactDOM.render(<div> {counter++} </div>, document.getElementById("root"));
}
