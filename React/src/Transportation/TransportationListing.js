import React from "react";
import Vehicle from "./Vehicle";

function TransportationListing(props) {
  return (
    <div>
      <h1>{props.name}</h1>
      {props.list.map(({ vehicle, index }) => {
        return <Vehicle object={vehicle} />;
      })}
    </div>
  );
}

export default TransportationListing;
