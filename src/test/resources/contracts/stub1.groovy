package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/example'
        body([
                "id": 12345
        ])

    }
    response {
        status 201
        body([
                name: "john"
        ])
        headers {
            contentType('application/json;charset=UTF-8')
        }
    }
}