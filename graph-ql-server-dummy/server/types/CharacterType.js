const { 
    GraphQLObjectType, 
    GraphQLInt, 
    GraphQLString, 
    GraphQLNonNull, 
    GraphQLList
} = require("graphql");
const LocationType = require("./LocationType");
const OriginType = require("./OriginType");

const CharacterType = new GraphQLObjectType({
    name: 'Character',
    description: 'This is a character',
    fields: () => ({
        id: { type: GraphQLNonNull(GraphQLInt) },
        name: { type: GraphQLNonNull(GraphQLString) },
        status: { type: GraphQLNonNull(GraphQLString) },
        species: { type: GraphQLNonNull(GraphQLString) },
        gender: {type: GraphQLNonNull(GraphQLString) },
        origin:{
            type: OriginType
        },
        location:{
            type: LocationType
        },
        image: {type: GraphQLNonNull(GraphQLString) },
        url: { type: GraphQLNonNull(GraphQLString) },
        created: { type: GraphQLNonNull(GraphQLString) },
    })
  })

  module.exports = CharacterType