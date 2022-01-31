const { GraphQLObjectType, GraphQLString } = require("graphql");

const LocationType = new GraphQLObjectType({
    name: 'location',
    fields: () => ({
        name: {
            type: GraphQLString
        },
        url:{
            type: GraphQLString
        }
    })
})

module.exports = LocationType