const { 
    GraphQLObjectType, 
    GraphQLList 
} = require("graphql");
const CharacterType = require("./CharacterType");

const CharactersType = new GraphQLObjectType({
    name: 'characters',
    fields: () => ({
        results: {
            type: new GraphQLList(CharacterType),
        }
    })
})

module.exports = CharactersType