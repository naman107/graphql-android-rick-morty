const { GraphQLObjectType } = require("graphql");
const charactersData = require("../seedData/characters");
const CharactersType = require("./CharactersType");

const RootQueryType = new GraphQLObjectType({
    name: 'Query',
    description: 'GET ALL',
    fields: () => ({
      characters: {
          type: CharactersType,
          resolve: () => charactersData
      }
    })
  })

  module.exports = RootQueryType