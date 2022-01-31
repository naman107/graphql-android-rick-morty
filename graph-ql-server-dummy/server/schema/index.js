const { GraphQLSchema } = require("graphql");
const RootQueryType = require("../types/RootQueryType");

const schema = new GraphQLSchema({
    query: RootQueryType
})

module.exports = schema