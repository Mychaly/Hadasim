import React, { useEffect, useState } from "react";
import personServices from "./Services/personService.js";
import ShowPersons from "./Components/showPersons.js";
import Summary from "./Components/summary.js";

function App() {
  return (
    <>
    {/* <Summary></Summary> */}
      <ShowPersons></ShowPersons>
     {/* <ImageUploader></ImageUploader> */}
    </>
  );
}

export default App;
