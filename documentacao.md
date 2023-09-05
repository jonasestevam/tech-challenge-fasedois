---
title: OpenAPI definition v0
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="openapi-definition">OpenAPI definition v0</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

Base URLs:

* <a href="http://localhost:8080/api">http://localhost:8080/api</a>

<h1 id="openapi-definition-person-controller">person-controller</h1>

## getAll

<a id="opIdgetAll"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/person \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/person HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/person',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/person',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/person', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/person', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/person");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/person", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /person`

*Get all persons*

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="getall-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns all persons|[PersonDTO](#schemapersondto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## update

<a id="opIdupdate"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8080/api/person \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
PUT http://localhost:8080/api/person HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/person',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.put 'http://localhost:8080/api/person',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.put('http://localhost:8080/api/person', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8080/api/person', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/person");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8080/api/person", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="update-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PersonDTO](#schemapersondto)|true|none|

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="update-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the update person|[PersonDTO](#schemapersondto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## save

<a id="opIdsave"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/api/person \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
POST http://localhost:8080/api/person HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/person',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.post 'http://localhost:8080/api/person',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.post('http://localhost:8080/api/person', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/api/person', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/person");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/api/person", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="save-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PersonDTO](#schemapersondto)|true|none|

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="save-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the created person|[PersonDTO](#schemapersondto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## getById

<a id="opIdgetById"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/person/{id} \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/person/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/person/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/person/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/person/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/person/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/person/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/person/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /person/{id}`

*Gets a person by ID*

<h3 id="getbyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string(uuid)|true|none|

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="getbyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the person|[PersonDTO](#schemapersondto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## delete

<a id="opIddelete"></a>

> Code samples

```shell
# You can also use wget
curl -X DELETE http://localhost:8080/api/person/{id} \
  -H 'Accept: application/json'

```

```http
DELETE http://localhost:8080/api/person/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/person/{id}',
{
  method: 'DELETE',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.delete 'http://localhost:8080/api/person/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.delete('http://localhost:8080/api/person/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('DELETE','http://localhost:8080/api/person/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/person/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("DELETE", "http://localhost:8080/api/person/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`DELETE /person/{id}`

*Deletes a person by ID*

<h3 id="delete-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string(uuid)|true|none|

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="delete-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Empty return|[PersonDTO](#schemapersondto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## getFiltered

<a id="opIdgetFiltered"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/person/filter?filter=name,string,email,string,phoneNumber,string,gender,string,birthDate,2019-08-24,parentEmail,string \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/person/filter?filter=name,string,email,string,phoneNumber,string,gender,string,birthDate,2019-08-24,parentEmail,string HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/person/filter?filter=name,string,email,string,phoneNumber,string,gender,string,birthDate,2019-08-24,parentEmail,string',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/person/filter',
  params: {
  'filter' => '[PersonFilterDTO](#schemapersonfilterdto)'
}, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/person/filter', params={
  'filter': {
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parentEmail": "string"
}
}, headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/person/filter', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/person/filter?filter=name,string,email,string,phoneNumber,string,gender,string,birthDate,2019-08-24,parentEmail,string");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/person/filter", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /person/filter`

*Get filtered persons*

<h3 id="getfiltered-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|filter|query|[PersonFilterDTO](#schemapersonfilterdto)|true|none|

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}
```

<h3 id="getfiltered-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns filtered persons|[PersonDTO](#schemapersondto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="openapi-definition-home-appliance-controller">home-appliance-controller</h1>

## getAll_1

<a id="opIdgetAll_1"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/homeappliance \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/homeappliance HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/homeappliance',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/homeappliance',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/homeappliance', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/homeappliance', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/homeappliance");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/homeappliance", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="getall_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns all the home appliance|[HomeApplianceDTO](#schemahomeappliancedto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## update_1

<a id="opIdupdate_1"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8080/api/homeappliance \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
PUT http://localhost:8080/api/homeappliance HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/homeappliance',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.put 'http://localhost:8080/api/homeappliance',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.put('http://localhost:8080/api/homeappliance', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8080/api/homeappliance', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/homeappliance");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8080/api/homeappliance", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="update_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[HomeApplianceDTO](#schemahomeappliancedto)|true|none|

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="update_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the update home appliance|[HomeApplianceDTO](#schemahomeappliancedto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## save_1

<a id="opIdsave_1"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/api/homeappliance \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
POST http://localhost:8080/api/homeappliance HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/homeappliance',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.post 'http://localhost:8080/api/homeappliance',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.post('http://localhost:8080/api/homeappliance', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/api/homeappliance', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/homeappliance");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/api/homeappliance", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="save_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[HomeApplianceDTO](#schemahomeappliancedto)|true|none|

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="save_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the created home appliance|[HomeApplianceDTO](#schemahomeappliancedto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## getByID

<a id="opIdgetByID"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/homeappliance/{id} \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/homeappliance/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/homeappliance/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/homeappliance/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/homeappliance/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/homeappliance/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/homeappliance/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/homeappliance/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /homeappliance/{id}`

*Gets a home appliance by ID*

<h3 id="getbyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string(uuid)|true|none|

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="getbyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the home appliance|[HomeApplianceDTO](#schemahomeappliancedto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## delete_1

<a id="opIddelete_1"></a>

> Code samples

```shell
# You can also use wget
curl -X DELETE http://localhost:8080/api/homeappliance/{id} \
  -H 'Accept: application/json'

```

```http
DELETE http://localhost:8080/api/homeappliance/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/homeappliance/{id}',
{
  method: 'DELETE',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.delete 'http://localhost:8080/api/homeappliance/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.delete('http://localhost:8080/api/homeappliance/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('DELETE','http://localhost:8080/api/homeappliance/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/homeappliance/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("DELETE", "http://localhost:8080/api/homeappliance/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`DELETE /homeappliance/{id}`

*Deletes a home appliance by ID*

<h3 id="delete_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string(uuid)|true|none|

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="delete_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Empty return|[HomeApplianceDTO](#schemahomeappliancedto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## getFiltered_1

<a id="opIdgetFiltered_1"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/homeappliance/filter?filter=name,string,description,string,type,BLENDER,brand,string,powerInWatts,string,voltage,string,model,string \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/homeappliance/filter?filter=name,string,description,string,type,BLENDER,brand,string,powerInWatts,string,voltage,string,model,string HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/homeappliance/filter?filter=name,string,description,string,type,BLENDER,brand,string,powerInWatts,string,voltage,string,model,string',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/homeappliance/filter',
  params: {
  'filter' => '[HomeApplianceFilterDTO](#schemahomeappliancefilterdto)'
}, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/homeappliance/filter', params={
  'filter': {
  "name": "string",
  "description": "string",
  "type": "BLENDER",
  "brand": "string",
  "powerInWatts": "string",
  "voltage": "string",
  "model": "string"
}
}, headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/homeappliance/filter', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/homeappliance/filter?filter=name,string,description,string,type,BLENDER,brand,string,powerInWatts,string,voltage,string,model,string");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/homeappliance/filter", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /homeappliance/filter`

*Get the filtered home appliances*

<h3 id="getfiltered_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|filter|query|[HomeApplianceFilterDTO](#schemahomeappliancefilterdto)|true|none|

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}
```

<h3 id="getfiltered_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the filtered home appliances|[HomeApplianceDTO](#schemahomeappliancedto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="openapi-definition-addres-controller">addres-controller</h1>

## getAll_2

<a id="opIdgetAll_2"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/address \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/address HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/address',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/address',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/address', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/address', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/address");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/address", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /address`

*Get all the addresses*

> Example responses

> 400 Response

```json
{
  "errorMessage": "string",
  "exception": "string"
}
```

<h3 id="getall_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns all the addresses|None|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<h3 id="getall_2-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## update_2

<a id="opIdupdate_2"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8080/api/address \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
PUT http://localhost:8080/api/address HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/address',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.put 'http://localhost:8080/api/address',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.put('http://localhost:8080/api/address', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8080/api/address', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/address");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8080/api/address", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

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

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[AddressDTO](#schemaaddressdto)|true|none|

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

<h3 id="update_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the updated address|[AddressDTO](#schemaaddressdto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## save_2

<a id="opIdsave_2"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/api/address \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
POST http://localhost:8080/api/address HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string",
  "number": 0
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/address',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.post 'http://localhost:8080/api/address',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.post('http://localhost:8080/api/address', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/api/address', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/address");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/api/address", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

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

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[AddressDTO](#schemaaddressdto)|true|none|

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

<h3 id="save_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|201|[Created](https://tools.ietf.org/html/rfc7231#section-6.3.2)|Returns the created address|[AddressDTO](#schemaaddressdto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## getById_1

<a id="opIdgetById_1"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/address/{id} \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/address/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/address/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/address/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/address/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/address/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/address/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/address/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /address/{id}`

*Gets an address by ID*

<h3 id="getbyid_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string(uuid)|true|none|

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

<h3 id="getbyid_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the address|[AddressDTO](#schemaaddressdto)|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<aside class="success">
This operation does not require authentication
</aside>

## delete_2

<a id="opIddelete_2"></a>

> Code samples

```shell
# You can also use wget
curl -X DELETE http://localhost:8080/api/address/{id} \
  -H 'Accept: application/json'

```

```http
DELETE http://localhost:8080/api/address/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/address/{id}',
{
  method: 'DELETE',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.delete 'http://localhost:8080/api/address/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.delete('http://localhost:8080/api/address/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('DELETE','http://localhost:8080/api/address/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/address/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("DELETE", "http://localhost:8080/api/address/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`DELETE /address/{id}`

*Deletes an address by ID*

<h3 id="delete_2-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string(uuid)|true|none|

> Example responses

> 400 Response

```json
{
  "errorMessage": "string",
  "exception": "string"
}
```

<h3 id="delete_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Empty return|None|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<h3 id="delete_2-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## getFiltered_2

<a id="opIdgetFiltered_2"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/address/filter?filter=id,497f6eca-6276-4993-bfeb-53cbbbba6f08,streetName,string,neighborhood,string,city,string,state,string \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/address/filter?filter=id,497f6eca-6276-4993-bfeb-53cbbbba6f08,streetName,string,neighborhood,string,city,string,state,string HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/address/filter?filter=id,497f6eca-6276-4993-bfeb-53cbbbba6f08,streetName,string,neighborhood,string,city,string,state,string',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/address/filter',
  params: {
  'filter' => '[AddressFilterDTO](#schemaaddressfilterdto)'
}, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/address/filter', params={
  'filter': {
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string"
}
}, headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/address/filter', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/address/filter?filter=id,497f6eca-6276-4993-bfeb-53cbbbba6f08,streetName,string,neighborhood,string,city,string,state,string");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/address/filter", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /address/filter`

*Get the filtered addresses*

<h3 id="getfiltered_2-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|filter|query|[AddressFilterDTO](#schemaaddressfilterdto)|true|none|

> Example responses

> 400 Response

```json
{
  "errorMessage": "string",
  "exception": "string"
}
```

<h3 id="getfiltered_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Returns the filtered addresses|None|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Returns the error|[ErrorDTO](#schemaerrordto)|

<h3 id="getfiltered_2-responseschema">Response Schema</h3>

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

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|errorMessage|string|false|none|none|
|exception|string|false|none|none|

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

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string(uuid)|false|none|none|
|streetName|string|true|none|none|
|neighborhood|string|true|none|none|
|city|string|true|none|none|
|state|string|true|none|none|
|number|integer(int32)|true|none|none|

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
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  },
  "addresses": [
    {
      "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
      "streetName": "string",
      "neighborhood": "string",
      "city": "string",
      "state": "string",
      "number": 0
    }
  ]
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string(uuid)|false|none|none|
|name|string|true|none|none|
|email|string|true|none|none|
|phoneNumber|string|true|none|none|
|gender|string|false|none|none|
|birthDate|string(date)|true|none|none|
|parent|[PersonDTO](#schemapersondto)|false|none|none|
|addresses|[[AddressDTO](#schemaaddressdto)]|false|none|none|

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
  "model": "string",
  "owner": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "name": "string",
    "email": "string",
    "phoneNumber": "string",
    "gender": "string",
    "birthDate": "2019-08-24",
    "parent": {},
    "addresses": [
      {
        "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
        "streetName": "string",
        "neighborhood": "string",
        "city": "string",
        "state": "string",
        "number": 0
      }
    ]
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string(uuid)|false|none|none|
|name|string|true|none|none|
|description|string|true|none|none|
|type|string|true|none|none|
|brand|string|true|none|none|
|powerInWatts|string|true|none|none|
|voltage|string|true|none|none|
|model|string|true|none|none|
|owner|[PersonDTO](#schemapersondto)|false|none|none|

#### Enumerated Values

|Property|Value|
|---|---|
|type|BLENDER|
|type|AIR_CONDITIONER|
|type|VACUUM_CLEANER|
|type|MICROWAVE|
|type|STOVE|
|type|WASHING_MACHINE|
|type|TV|
|type|REFRIGERATOR|
|type|ELECTRIC_COOKER|
|type|TOASTER|
|type|COFFEE_MAKER|

<h2 id="tocS_PersonFilterDTO">PersonFilterDTO</h2>
<!-- backwards compatibility -->
<a id="schemapersonfilterdto"></a>
<a id="schema_PersonFilterDTO"></a>
<a id="tocSpersonfilterdto"></a>
<a id="tocspersonfilterdto"></a>

```json
{
  "name": "string",
  "email": "string",
  "phoneNumber": "string",
  "gender": "string",
  "birthDate": "2019-08-24",
  "parentEmail": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|name|string|false|none|none|
|email|string|false|none|none|
|phoneNumber|string|false|none|none|
|gender|string|false|none|none|
|birthDate|string(date)|false|none|none|
|parentEmail|string|false|none|none|

<h2 id="tocS_HomeApplianceFilterDTO">HomeApplianceFilterDTO</h2>
<!-- backwards compatibility -->
<a id="schemahomeappliancefilterdto"></a>
<a id="schema_HomeApplianceFilterDTO"></a>
<a id="tocShomeappliancefilterdto"></a>
<a id="tocshomeappliancefilterdto"></a>

```json
{
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

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|name|string|false|none|none|
|description|string|false|none|none|
|type|string|false|none|none|
|brand|string|false|none|none|
|powerInWatts|string|false|none|none|
|voltage|string|false|none|none|
|model|string|false|none|none|

#### Enumerated Values

|Property|Value|
|---|---|
|type|BLENDER|
|type|AIR_CONDITIONER|
|type|VACUUM_CLEANER|
|type|MICROWAVE|
|type|STOVE|
|type|WASHING_MACHINE|
|type|TV|
|type|REFRIGERATOR|
|type|ELECTRIC_COOKER|
|type|TOASTER|
|type|COFFEE_MAKER|

<h2 id="tocS_AddressFilterDTO">AddressFilterDTO</h2>
<!-- backwards compatibility -->
<a id="schemaaddressfilterdto"></a>
<a id="schema_AddressFilterDTO"></a>
<a id="tocSaddressfilterdto"></a>
<a id="tocsaddressfilterdto"></a>

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "streetName": "string",
  "neighborhood": "string",
  "city": "string",
  "state": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string(uuid)|false|none|none|
|streetName|string|false|none|none|
|neighborhood|string|false|none|none|
|city|string|false|none|none|
|state|string|false|none|none|

