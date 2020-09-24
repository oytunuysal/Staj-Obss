import React from "react";
import ReactDOM from "react-dom";
import ShoppingTitle from "./ShoppingTitle";
import ShoppingList from "./ShoppingList";

function ShoppingApp(props) {
  return (
    <div>
      <ShoppingTitle title="Oytun's Shopping List" numberOfItems="5" />
      <ShoppingList list={["Tomato", "Bread", "Cheese"]} />
      <ShoppingList list={["Shirt", "Short", "Cap"]} />
      <ShoppingList list={["Pencil", "Paper", "Rubber"]} />
    </div>
  );
}

//ReactDOM.render(<ShoppingApp />, document.getElementById("root"));
