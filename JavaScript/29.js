/* JavaScript manipulates the DOM i.e. Document Object Model.
 * document is the keyword used to grab elements.
 */

//Select a tag or class
const heading = document.querySelector('#heading')
//Method 2: Only for ID's. It's also a bit faster.
const heading2 = document.getElementById('heading')
//Change it's value
heading.innerText = 'Hello World!'

//querySelector only selects the first matching element.
const listItems = document.querySelector('ul li')

//querySelectorAll selects all elements, returns an array.
const listItems2 = document.querySelectorAll('ul li')

for (let index = 0; index < listItems2.length; index++)
{
    listItems2[index].innerText = 'New Text'
}

let counter = 0
//Get the button by ID

const ulElement = document.getElementById("list-items")
const olElement = document.getElementById("list-items2")

const getButtonIncrement = document.querySelector('#increment')
const getButtonDecrement = document.getElementById('decrement')

//getButtonIncrement.addEventListener('type of event to listen to', function() to run)
getButtonIncrement.addEventListener('click', function () 
{
    let counterElement = document.getElementById('counter')
    counterElement.innerText = ++counter

    //Create an element
    //document.createElement('id')
    const li = document.createElement('li')
    //Create a new text node.
    const textNode = document.createTextNode('Sentence: '+counter)
    //Append the text node to the list item.
    li.appendChild(textNode)
    //Append the list item to the list.
    ulElement.appendChild(li)
})

getButtonDecrement.addEventListener('click', function () 
{
    document.getElementById('counter').innerText = --counter
    const li = document.createElement('li')
    li.innerHTML = '<b>Sentence: </b> '+ counter
    olElement.appendChild(li)
    
})

//Part 2
