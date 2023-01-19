import React, { useState } from 'react';
import './App.css';

function App() {
  const [task,setTask] = useState()
  const [todos,setToDo] = useState([])
  function createToDo() {
    setToDo(oldToDo => {
      return [...oldToDo, task]
    })
  }
  
  return (
    <div>
      <h1>ToDo App</h1>
      {/* Value: the current value of the text field.
        * Here, the value of the field changes according to the value entered by the user, because of the 'onChange' function.  */}
      <input type="text" value={task} onChange={event => {
      setTask(event.target.value)}}
      />
      <button type="submit" onClick={createToDo}>Submit</button>
      <ul>
        {/* Convert all elements in the list 'setToDo' to list items */}
        {todos.map(todo => {
          return <li>{todo}</li>
        })}
      </ul>
    </div>
  );
}

export default App;
