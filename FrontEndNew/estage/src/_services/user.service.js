/** Import des modules nécessaires */
import Axios from './caller.service'


let getAllUsers = () => {
    return Axios.get('/users')
}

let getUser = (uid) => {
    return Axios.get('/user/'+uid)
}

let updateUser = (user) => {
    return Axios.patch('/users/'+user.id, user)
}

let createUser = (user) => {
    return Axios.post('/register', user)
}

let deleteUser = (uid) => {
    return Axios.delete('/users/'+uid)
}

export const userService = {
    getAllUsers,
    getUser,
    updateUser,
    createUser,
    deleteUser,
}