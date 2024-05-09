document.getElementById("Addbutton")
    .addEventListener("click", saveGuitar);

function saveGuitar() {

    let requestBody = mapRequest()

    fetch("http://localhost:8080/guitar", {
        method: "POST",
        body: JSON.stringify(requestBody),
        headers:{
             "Content-type":"application/json"
        }
    })
        .then(res => res.json())
        .then(data => {
            console.log(data)
        });
}

function mapRequest() {

    let requestBody = {
        GuitarNumber: undefined,
        GuitarBrand: undefined,
        Qty: undefined,
        Type: undefined

    }

    requestBody.GuitarNumber = document.getElementById("GuitarNumber").value;
    requestBody.GuitarBrand = document.getElementById("GuitarBrand").value;
    requestBody.Qty = document.getElementById("Qty").value;
    requestBody.Type = document.getElementById("Type").value;



    return requestBody;
}