//Using Fetch API
const promiseObject = fetch('data.json')
// .then = After fetching the data, run this function.
promiseObject.then(function (response) {
    //Response from the initial Promise Object contains metadata about the fetched file data.json, but not the acual data.
    const promiseObject2 = response.json()
    //This 2nd object returns the actual data.
    promiseObject2.then(function (data) {
        console.log(data);
    })
})