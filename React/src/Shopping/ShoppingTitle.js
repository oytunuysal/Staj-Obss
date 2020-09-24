import React from "react";

function ShoppingTitle(props) {
  return (
    <div>
      <h1>{props.title}</h1>
      <h1>{props.numberOfItems}</h1>
    </div>
  );
}
export default ShoppingTitle;
