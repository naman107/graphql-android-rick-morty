const { 
    GraphQLObjectType, 
    GraphQLString 
} = require("graphql");

const OriginType = new GraphQLObjectType({
    name: 'origin',
    fields: () => ({
        name:{
            type: GraphQLString
        },
        url: {
            type: GraphQLString
        }
    })
})

module.exports = OriginType