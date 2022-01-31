const express = require('express')
const app = express()

const {graphqlHTTP} = require('express-graphql')
const schema = require('./schema')

app.use('/graphql', graphqlHTTP({
  schema: schema,
  graphiql: true
}))

app.listen(3000, () => console.log('Server Running at PORT: 3000'))