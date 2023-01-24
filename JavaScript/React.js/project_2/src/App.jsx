import './App.css';
// import useState, useEffect
import React, { useState, useEffect } from 'react'

function App() {
  function clickFn() {
    console.log("I was clicked");
  }
  // Counter = The value
  // setCounter = The function that modifies that value. This function takes both values and functions as input.
  // useState(0) = The initial value of 'counter' is 0.
  const [counter,setCounter] = useState(0)
  function increaseCounter() {
    // Set the value of 'counter' to counter+1.
    // 2nd render
    // Method 1
    setCounter(counter+1)
  }

  function decreaseCounter() {
    // 3rd render
    // Method 2
    setCounter(function value() {
      return counter-1
    })
  }
  /* useEffect() checks the state of the variable(s) specified in the array.
   * Contains a function, and an array of elements.
   * Function: Runs whenever useEffect() detects any changes to the elements.
   * List of elements: Contains all elements useEffect will monitor.
   */
  useEffect(() => { // Arrow function
    // Mandatorily runs the 1st time useState() is invoked.
    console.log("useEffect() ran");
    // List of elements 'useEffect()' will monitor
  },[counter])
  // In this case, console.log('useEffect() ran') runs everytime the state of the variable 'counter' is updated.

  return <div>
    <h1>Counter: {counter}</h1>
    <button onClick={increaseCounter}>Increase</button>
    <button onClick={decreaseCounter}>Decrease</button>
    <br />
    <br />
    <button type="submit" onClick={clickFn}>Click me!</button>
    </div>
    
}

export default App;
