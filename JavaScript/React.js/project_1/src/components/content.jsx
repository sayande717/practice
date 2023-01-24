import React, { useState } from 'react';

function Content() {
    // useState is a hook, all hooks need to be defined at the top
    // counter = variable
    // setCounter = function which manipulates the value of counter.
    // useState(0) = Sets the value of the variable ie counter, to '0'.
    // NOTE: We're using  const even though the value of counter seems to change. This is because the value of counter does not really change, instead, a new variable 'counter' is created in the next render.
    // setCounter() - This function can accept both a value and a function. Check Method 1 in function increaseFn(), and Method 2 in function decreaseFn().
    const [counter, setCounter] = useState(0)

    function increaseFn()
    {
        // Set the value of counter to 1 whenever the button is pressed.
        // Method 1
        setCounter(counter + 1)      
    }
    
    function decreaseFn()
    {
        // Method 2
        setCounter(function(oldCounterValue) {
            return oldCounterValue - 1
        })
        // Arrow function
        // setCounter(oldCounterValue => oldCounterValue - 1)
    }

    return <div>
            <h1>Counter: {counter}</h1>
            <button onClick={increaseFn}>Increase</button>
            <button onClick={decreaseFn}>Decrease</button>
        </div>
}

export default Content