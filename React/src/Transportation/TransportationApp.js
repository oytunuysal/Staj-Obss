import React from "react";
import ReactDOM from "react-dom";
import TransportationListing from "./TransportationListing";
import Head from "./Head";

function TransportationApp(props) {
  return (
    <>
      <div>
        <Head />
        <TransportationListing
          name="Cars"
          list={[
            { type: "Car", year: "2013", model: "A", price: "32000" },
            { type: "Car", year: "2011", model: "B", price: "4400" },
            { type: "Car", year: "2016", model: "A", price: "15500" }
          ]}
        />
        <TransportationListing
          name="Truck"
          list={[
            { type: "Truck", year: "2014", model: "D", price: "18000" },
            { type: "Truck", year: "2013", model: "E", price: "5200" }
          ]}
        />
      </div>
    </>
  );
}

//ReactDOM.render(<TransportationApp />, document.getElementById("root"));
