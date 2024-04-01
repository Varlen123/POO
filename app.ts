

import { dbConfig } from './db';


console.log('Host:', dbConfig.host);
console.log('Port:', dbConfig.port);
console.log('Username:', dbConfig.user);
console.log('Password:', dbConfig.password);
console.log('Database:', dbConfig.database);



import { queryDatabase } from './database';

async function main() {
    try {
        
        const users = await queryDatabase('SELECT * FROM usuarios');
        console.log('Users:', users);


        console.log('Insertion successful!');
    } catch (error) {
        console.error('Error:', error);
    }
}

main();
