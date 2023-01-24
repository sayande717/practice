// React
import React from 'react';
// ReactDOM tells React how to create the various HTML elements on the screen.
import ReactDOM from 'react-dom/client';

// For ES6 export-import (ie importing from calc.js)
import sub from './calc' // For default functions
import { add } from './calc' //For all other functions
/* React Fundamentals.
 * React is an UI library that defines trees.
 * It tells the browser about the differences.
 * Instead of reloading the whole website, we can only reload the parts that have beeen updated.
 * public/index.html is the web page that is served to the we browser, by default.
 * We can tell React.js what to render, using a sample syntax as shown here.
 * We need to first create a div/section in the index.html file, then specify what to render, in this file (index.js).
 */

// Grab the 'root' div.
const root = ReactDOM.createRoot(document.getElementById('root'));
// Render these in that division.
root.render(
  <h1>Hello, World!</h1>
);


const calc = ReactDOM.createRoot(document.getElementById('calc'))
calc.render(
  <h2>Sum: {add(5,6)}
  <br />
    Subtraction: {sub(6, 5)}</h2>
)
