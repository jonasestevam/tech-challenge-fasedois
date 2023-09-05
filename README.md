
<h1 id="openapi-definition">Documentação do projeto criado na primeira fase do curso de pós-graduação em Arquitetura e Desenvolvimento Java da FIAP.</h1>

# Relatório Técnico - API REST em Spring Boot

## Tecnologias e Ferramentas Utilizadas
A seguir estão as principais tecnologias e ferramentas utilizadas no desenvolvimento da API REST:

1. **Spring Boot**: Um framework Java que simplifica o desenvolvimento de aplicativos Java, fornecendo configurações e dependências por padrão, facilitando a criação de uma API REST robusta e escalável.

2. **Java 17**: A linguagem de programação principal utilizada para desenvolver a API REST.

3. **Spring Framework**: Fornece um conjunto abrangente de recursos para desenvolvimento de aplicativos empresariais, incluindo gerenciamento de dependências, injeção de dependência, segurança, controle transacional e muito mais.

4. **Spring Data JPA**: Uma biblioteca do Spring que facilita a integração de aplicativos Java com bancos de dados relacionais usando a especificação JPA (Java Persistence API).

5. **Hibernate**: Um framework de mapeamento objeto-relacional (ORM) utilizado em conjunto com o Spring Data JPA para facilitar o acesso e manipulação dos dados no banco de dados.

6. **H2Database**: Um sistema de gerenciamento de banco de dados relacional em memória utilizado como banco de dados principal para a API REST.

7. **Postman**: Uma ferramenta de desenvolvimento de API que facilita o teste e a documentação das chamadas de API.

8. **Lombok**: O Project Lombok é uma biblioteca para a linguagem de programação Java que oferece recursos para reduzir a verbosidade do código, simplificar a criação de classes e aumentar a produtividade do desenvolvedor.

9. **Springdoc**: O Springdoc é uma biblioteca que facilita a geração automática de documentação no padrão OpenAPI para APIs RESTful desenvolvidas com o framework Spring Boot.


## Documentação

Base URLs:

* <a href="http://localhost:8080/api">http://localhost:8080/api</a>

<h1 id="openapi-definition-person-controller">API de Gestão de Pessoas</h1>

## getAll

<a id="opIdgetAll"></a>

`GET /person`

*Get all the persons*

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}
```

<h3 id="getall-responses">Responses</h3>

| Status | Meaning                                                          | Description            | Schema                        |
| ------ | ---------------------------------------------------------------- | ---------------------- | ----------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns all the person | [PersonDTO](#schemapersondto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Returns the error      | [ErrorDTO](#schemaerrordto)   |

<aside class="success">
This operation does not require authentication
</aside>

## update

<a id="opIdupdate"></a>

`PUT /person`

*Update a person*

> Body parameter

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}
```

<h3 id="update-parameters">Parameters</h3>

| Name | In   | Type                          | Required | Description |
| ---- | ---- | ----------------------------- | -------- | ----------- |
| body | body | [PersonDTO](#schemapersondto) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}
```

<h3 id="update-responses">Responses</h3>

| Status | Meaning                                                          | Description               | Schema                        |
| ------ | ---------------------------------------------------------------- | ------------------------- | ----------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the update person | [PersonDTO](#schemapersondto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Returns the error         | [ErrorDTO](#schemaerrordto)   |

<aside class="success">
This operation does not require authentication
</aside>

## save

<a id="opIdsave"></a>

`POST /person`

*Create a person*

> Body parameter

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}
```

<h3 id="save-parameters">Parameters</h3>

| Name | In   | Type                          | Required | Description |
| ---- | ---- | ----------------------------- | -------- | ----------- |
| body | body | [PersonDTO](#schemapersondto) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}
```

<h3 id="save-responses">Responses</h3>

| Status | Meaning                                                          | Description                | Schema                        |
| ------ | ---------------------------------------------------------------- | -------------------------- | ----------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the created person | [PersonDTO](#schemapersondto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Returns the error          | [ErrorDTO](#schemaerrordto)   |

<aside class="success">
This operation does not require authentication
</aside>

## getById

<a id="opIdgetById"></a>

`GET /person/{id}`

*Gets a person by ID*

<h3 id="getbyid-parameters">Parameters</h3>

| Name | In   | Type         | Required | Description |
| ---- | ---- | ------------ | -------- | ----------- |
| id   | path | string(uuid) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}
```

<h3 id="getbyid-responses">Responses</h3>

| Status | Meaning                                                          | Description        | Schema                        |
| ------ | ---------------------------------------------------------------- | ------------------ | ----------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the person | [PersonDTO](#schemapersondto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Returns the error  | [ErrorDTO](#schemaerrordto)   |

<aside class="success">
This operation does not require authentication
</aside>

## delete

<a id="opIddelete"></a>

`DELETE /person/{id}`

*Deletes a person by ID*

<h3 id="delete-parameters">Parameters</h3>

| Name | In   | Type         | Required | Description |
| ---- | ---- | ------------ | -------- | ----------- |
| id   | path | string(uuid) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}
```

<h3 id="delete-responses">Responses</h3>

| Status | Meaning                                                          | Description       | Schema                        |
| ------ | ---------------------------------------------------------------- | ----------------- | ----------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Empty return      | None                          |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Returns the error | [ErrorDTO](#schemaerrordto)   |

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="openapi-definition-home-appliance-controller">API de Gestão de Eletrodométicos</h1>

## getAll

<a id="opIdgetAll_1"></a>

`GET /homeappliance`

*Get all the home appliances*

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
```

> 400 Response

<h3 id="getall_1-responses">Responses</h3>

| Status | Meaning                                                          | Description                    | Schema                                      |
| ------ | ---------------------------------------------------------------- | ------------------------------ | ------------------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns all the home appliance | [HomeApplianceDTO](#schemahomeappliancedto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request                    |  [ErrorDTO](#schemaerrordto)                                        |

<h3 id="-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## update

<a id="opIdupdate_1"></a>

`PUT /homeappliance`

*Update a home appliance*

> Body parameter

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
```

<h3 id="update_1-parameters">Parameters</h3>

| Name | In   | Type                                        | Required | Description |
| ---- | ---- | ------------------------------------------- | -------- | ----------- |
| body | body | [HomeApplianceDTO](#schemahomeappliancedto) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
```

> 400 Response

<h3 id="update_1-responses">Responses</h3>

| Status | Meaning                                                          | Description                       | Schema                                      |
| ------ | ---------------------------------------------------------------- | --------------------------------- | ------------------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the update home appliance | [HomeApplianceDTO](#schemahomeappliancedto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request                       |  [ErrorDTO](#schemaerrordto)                                        |

<h3 id="update_1-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## save

<a id="opIdsave_1"></a>

`POST /homeappliance`

*Create a home appliance*

> Body parameter

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
```

<h3 id="save_1-parameters">Parameters</h3>

| Name | In   | Type                                        | Required | Description |
| ---- | ---- | ------------------------------------------- | -------- | ----------- |
| body | body | [HomeApplianceDTO](#schemahomeappliancedto) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
```

> 400 Response

<h3 id="save_1-responses">Responses</h3>

| Status | Meaning                                                          | Description                        | Schema                                      |
| ------ | ---------------------------------------------------------------- | ---------------------------------- | ------------------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the created home appliance | [HomeApplianceDTO](#schemahomeappliancedto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request                        |  [ErrorDTO](#schemaerrordto)                                        |

<h3 id="save_1-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## getByID

<a id="opIdgetByID"></a>

`GET /homeappliance/{id}`

*Gets a home appliance by ID*

<h3 id="getbyid-parameters">Parameters</h3>

| Name | In   | Type         | Required | Description |
| ---- | ---- | ------------ | -------- | ----------- |
| id   | path | string(uuid) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
```

> 400 Response

<h3 id="getbyid-responses">Responses</h3>

| Status | Meaning                                                          | Description                | Schema                                      |
| ------ | ---------------------------------------------------------------- | -------------------------- | ------------------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the home appliance | [HomeApplianceDTO](#schemahomeappliancedto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request                |  [ErrorDTO](#schemaerrordto)                                        |

<h3 id="getbyid-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## delete

<a id="opIddelete_1"></a>

`DELETE /homeappliance/{id}`

*Deletes a home appliance by ID*

<h3 id="delete_1-parameters">Parameters</h3>

| Name | In   | Type         | Required | Description |
| ---- | ---- | ------------ | -------- | ----------- |
| id   | path | string(uuid) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
```

> 400 Response

<h3 id="delete_1-responses">Responses</h3>

| Status | Meaning                                                          | Description  | Schema                                      |
| ------ | ---------------------------------------------------------------- | ------------ | ------------------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          |  | None                                        |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request  |  [ErrorDTO](#schemaerrordto)                                        |

<h3 id="delete_1-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="openapi-definition-addres-controller">API de gestão de endereços</h1>

## getAll

<a id="opIdgetAll_2"></a>

`GET /address`

*Get all the addresses*

> Example responses

> 400 Response

<h3 id="getall_2-responses">Responses</h3>

| Status | Meaning                                                          | Description               | Schema |
| ------ | ---------------------------------------------------------------- | ------------------------- | ------ |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns all the addresses | None   |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request               |  [ErrorDTO](#schemaerrordto)   |

<h3 id="getall_2-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## update

<a id="opIdupdate_2"></a>

`PUT /address`

*Update an address*

> Body parameter

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}
```

<h3 id="update_2-parameters">Parameters</h3>

| Name | In   | Type                            | Required | Description |
| ---- | ---- | ------------------------------- | -------- | ----------- |
| body | body | [AddressDTO](#schemaaddressdto) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}
```

> 400 Response

<h3 id="update_2-responses">Responses</h3>

| Status | Meaning                                                          | Description                 | Schema                          |
| ------ | ---------------------------------------------------------------- | --------------------------- | ------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the updated address | [AddressDTO](#schemaaddressdto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request                 |  [ErrorDTO](#schemaerrordto)                            |

<h3 id="update_2-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## save

<a id="opIdsave_2"></a>

`POST /address`

*Create an address*

> Body parameter

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}
```

<h3 id="save_2-parameters">Parameters</h3>

| Name | In   | Type                            | Required | Description |
| ---- | ---- | ------------------------------- | -------- | ----------- |
| body | body | [AddressDTO](#schemaaddressdto) | true     | none        |

> Example responses

> 201 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}
```

> 400 Response

<h3 id="save_2-responses">Responses</h3>

| Status | Meaning                                                          | Description                 | Schema                          |
| ------ | ---------------------------------------------------------------- | --------------------------- | ------------------------------- |
| 201    | [Created](https://tools.ietf.org/html/rfc7231#section-6.3.2)     | Returns the created address | [AddressDTO](#schemaaddressdto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request                 |  [ErrorDTO](#schemaerrordto)                            |

<h3 id="save_2-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## getById

<a id="opIdgetById_1"></a>

`GET /address/{id}`

*Gets an address by ID*

<h3 id="getbyid_1-parameters">Parameters</h3>

| Name | In   | Type         | Required | Description |
| ---- | ---- | ------------ | -------- | ----------- |
| id   | path | string(uuid) | true     | none        |

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}
```

> 400 Response

<h3 id="getbyid_1-responses">Responses</h3>

| Status | Meaning                                                          | Description         | Schema                          |
| ------ | ---------------------------------------------------------------- | ------------------- | ------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          | Returns the address | [AddressDTO](#schemaaddressdto) |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request         |  [ErrorDTO](#schemaerrordto)                            |

<h3 id="getbyid_1-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## delete

<a id="opIddelete_2"></a>

`DELETE /address/{id}`

*Deletes an address by ID*

<h3 id="delete_2-parameters">Parameters</h3>

| Name | In   | Type         | Required | Description |
| ---- | ---- | ------------ | -------- | ----------- |
| id   | path | string(uuid) | true     | none        |

> Example responses

> 400 Response

<h3 id="delete_2-responses">Responses</h3>

| Status | Meaning                                                          | Description  | Schema |
| ------ | ---------------------------------------------------------------- | ------------ | ------ |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)          |  | None   |
| 400    | [Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1) | Bad Request  |  [ErrorDTO](#schemaerrordto)   |

<h3 id="delete_2-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_ErrorDTO">ErrorDTO</h2>
<!-- backwards compatibility -->
<a id="schemaerrordto"></a>
<a id="schema_ErrorDTO"></a>
<a id="tocSerrordto"></a>
<a id="tocserrordto"></a>

```json
{
  "errorMessage": "string",
  "exception": "string"
}

```

### Properties

| Name         | Type   | Required | Restrictions | Description |
| ------------ | ------ | -------- | ------------ | ----------- |
| errorMessage | string | false    | none         | none        |
| exception    | string | false    | none         | none        |

<h2 id="tocS_ValidationErrorDTO">ValidationErrorDTO</h2>
<!-- backwards compatibility -->
<a id="schemavalidationerrordto"></a>
<a id="schema_ValidationErrorDTO"></a>
<a id="tocSvalidationerrordto"></a>
<a id="tocsvalidationerrordto"></a>

```json
{
  "errorMessage": "string",
  "exception": "string",
  "validationErrors": {
    "property1": "string",
    "property2": "string"
  }
}

```

### Properties

| Name                       | Type   | Required | Restrictions | Description |
| -------------------------- | ------ | -------- | ------------ | ----------- |
| errorMessage               | string | false    | none         | none        |
| exception                  | string | false    | none         | none        |
| validationErrors           | object | false    | none         | none        |
| » **additionalProperties** | string | false    | none         | none        |

<h2 id="tocS_AddressDTO">AddressDTO</h2>
<!-- backwards compatibility -->
<a id="schemaaddressdto"></a>
<a id="schema_AddressDTO"></a>
<a id="tocSaddressdto"></a>
<a id="tocsaddressdto"></a>

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}

```

### Properties

| Name         | Type           | Required | Restrictions | Description |
| ------------ | -------------- | -------- | ------------ | ----------- |
| id           | string(uuid)   | false    | none         | none        |
| streetName   | string         | true     | none         | none        |
| neighborhood | string         | true     | none         | none        |
| city         | string         | true     | none         | none        |
| state        | string         | true     | none         | none        |
| number       | integer(int32) | true     | none         | none        |

<h2 id="tocS_PersonDTO">PersonDTO</h2>
<!-- backwards compatibility -->
<a id="schemapersondto"></a>
<a id="schema_PersonDTO"></a>
<a id="tocSpersondto"></a>
<a id="tocspersondto"></a>

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parent": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "address": {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  },
  "address": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "streetName": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string",
    "number": 0
  }
}

```

### Properties

| Name        | Type                            | Required | Restrictions | Description |
| ----------- | ------------------------------- | -------- | ------------ | ----------- |
| id          | string(uuid)                    | false    | none         | none        |
| name        | string                          | true     | none         | none        |
| email       | string                          | true     | none         | none        |
| phoneNumber | string                          | true     | none         | none        |
| gender      | string                          | false    | none         | none        |
| birthDate   | string(date)                    | true     | none         | none        |
| parent      | [PersonDTO](#schemapersondto)   | false    | none         | none        |
| address     | [AddressDTO](#schemaaddressdto) | false    | none         | none        |

<h2 id="tocS_HomeApplianceDTO">HomeApplianceDTO</h2>
<!-- backwards compatibility -->
<a id="schemahomeappliancedto"></a>
<a id="schema_HomeApplianceDTO"></a>
<a id="tocShomeappliancedto"></a>
<a id="tocshomeappliancedto"></a>

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}

```

### Properties

| Name         | Type         | Required | Restrictions | Description |
| ------------ | ------------ | -------- | ------------ | ----------- |
| id           | string(uuid) | false    | none         | none        |
| name         | string       | true     | none         | none        |
| description  | string       | true     | none         | none        |
| type         | string       | true     | none         | none        |
| brand        | string       | true     | none         | none        |
| powerInWatts | string       | true     | none         | none        |
| voltage      | string       | true     | none         | none        |
| model        | string       | true     | none         | none        |

#### Enumerated Values

| Property | Value           |
| -------- | --------------- |
| type     | BLENDER         |
| type     | AIR_CONDITIONER |
| type     | VACUUM_CLEANER  |
| type     | MICROWAVE       |
| type     | STOVE           |
| type     | WASHING_MACHINE |
| type     | TV              |
| type     | REFRIGERATOR    |
| type     | ELECTRIC_COOKER |
| type     | TOASTER         |
| type     | COFFEE_MAKER    |

