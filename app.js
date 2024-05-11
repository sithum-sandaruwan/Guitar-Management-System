document.getElementById("Addbutton")
    .addEventListener("click", saveGuitar);

function saveGuitar() {

    let requestBody = mapRequest()

    fetch("http://localhost:8080/guitar", {
        method: "POST",
        body: JSON.stringify(requestBody),
        headers: {
            "Content-type": "application/json"
        }
    })
    .then(res => res.json())
    .then(data => {
        console.log(data)
    })
}

function mapRequest() {

    let requestBody = {
        number: undefined,
        brand: undefined,
        qty: undefined,
        type: undefined

    }

    requestBody.number = document.getElementById("floatingnum").value;
    requestBody.brand = document.getElementById("floatingbrand").value;
    requestBody.qty = document.getElementById("floatingcount").value;
    requestBody.type = document.getElementById("floatingtype").value;



    return requestBody;
}