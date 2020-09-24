import React from "react";
import ShoppingItem from "./ShoppingItem";

function ShoppingList(props) {
  return (
    <div>
      <ShoppingItem item={props.list} />
    </div>
  );
}

export default ShoppingList;
