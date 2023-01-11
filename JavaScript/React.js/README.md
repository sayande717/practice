> To create a new React.js app: 
$ npx create-react-app app_name
A directory with the same name as that of the app, is created.

> Commands for running React.js (npm):
Below commands can only be run from within the app directory.
$ npm start     //Start the development server.
$ npm test      //Start the test runner.
$ npm run build //Bundles the app into static files for production

> Why index.jsx and not index.js?
Advantages of jsx over js:
1. Instead of writing verbose / extra code just for simple HTML, we can directly write code in HTML syntax, right within the jsx file.
React.js combines the best of both worlds (HTML & JavaScript), so we can use the 'functions' of JavaScript while also writing code in HTML syntax, at the same time.
2. You cannot write broken HTML, if you do so, React.js will tell you that there's something wrong with the code.
3. class is a reserved keyword. So,
Use: <div className="something">Whatever</div>
Instead of: <div class="something">Whatever</div>
4. Writing expressions (write within curly braces):
<h1> Result: { 2**4 } </h1>
Q. What can I write within the curly braces?
A. Anything that can be passed to a function as argument, can also be written within curly braces, as an expression.

> Short-circuiting
[Only for && ]
If all values are true, JavaScript returns the last argument.
If any 1 of the values is false, JavaScript will not return anything
So, 
<div>
    { true && console.log('Visible') }
</div>
...will print 'Visible'.
But,
<div>
    { false && console.log('Visible') }
</div>
...will not print 'Visible'.
Example,
let age = 20
<div>
    { (age < 18) && console.log('Visible') }
</div>
...will not print 'Visible'.

> Passing arguments to a function, for dynamically displaying them on a webpage

First, create the function
function custom(props) {
    return <p> Hello, {props.name}! </p>
}
export default custom

Now, we can use it as follows:
import 'Custom' from custom //file name=custom.jsx
root.render(<Custom name="sayan" />)

> Event Listeners (click):

function buttonClick() {
    console.log('Click')
}

<button onClick="{buttonClick}">Click Me!</button>
Everything within onClick={ } is executed whenever the button is clicked.

 > When should you use functions to update the value in stateful React.js?
 When the new value depends on the old value, use functions.
 If the 2 values are independent, just assign it within the useState function().