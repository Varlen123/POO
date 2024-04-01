
import mysql from 'mysql';
import { dbConfig } from './db';


export function connectDatabase() {
    return mysql.createConnection(dbConfig);
}

export function queryDatabase(sql: string, values?: any[]) {
    const connection = connectDatabase();

    return new Promise<any[]>((resolve, reject) => {
        connection.connect((err) => {
            if (err) {
                reject(err);
                return;
            }

            connection.query(sql, values, (error, results) => {
                connection.end(); 

                if (error) {
                    reject(error);
                    return;
                }

                resolve(results);
            });
        });
    });
}
