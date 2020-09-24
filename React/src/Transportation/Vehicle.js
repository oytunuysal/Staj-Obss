import React from "react";

function Vehicle(props) {
  return (
    <div>
      <p>
        Year = {props.year} Model = {props.model} Price = {props.price}
      </p>
    </div>
  );
}
export default Vehicle;
