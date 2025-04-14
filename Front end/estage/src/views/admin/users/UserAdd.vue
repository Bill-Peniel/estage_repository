<template>
    <div class="account-content">       
        
        <div class="row align-items-center justify-content-center">
            <p v-if="errors.length">
                <b>Merci de corriger les erreurs suivantes</b>
                <ul>
                    <li v-for="(error,index) in errors" :key="index">{{error}}</li>
                </ul>
            </p>
            <div class="col-md-12 col-lg-3 login-right">       
                <form @submit.prevent="ajout">   
                    <div class="login-header">
                        <h3>Création d'un utilisateur</h3>
                    </div>
                    <div class="form-group form-focus">
                        <input type="text" id="user_identifiant"  class="form-control floating" v-model="user.identifiant"/>
                        <label class="focus-label" for="user_identifiant">Matricule ou IFU</label>
                    </div> 
                    <div class="form-group form-focus">
                        <input type="text" id="user_name"  class="form-control floating" v-model="user.firstName"/>
                        <label class="focus-label" for="user_name">Nom</label>
                    </div>
                    <div class="form-group form-focus">
                        <input type="text" id="user_prenom"  class="form-control floating" v-model="user.lastName"/>
                        <label class="focus-label" for="user_prenom">Prénom</label>
                    </div>
                    <!-- <div class="formGroup">
                        <label for="user_pseudo">Pseudo</label>
                        <input type="text" id="user_pseudo" v-model="user.pseudo"/>
                    </div> -->
                    <div class="form-group form-focus">
                        <input type="text" id="user_email"  class="form-control floating" v-model="user.email"/>
                        <label class="focus-label" for="user_email">Email</label>
                    </div>
                    <div class="form-group form-focus">
                        <input type="text" id="user_email" class="form-control floating" v-model="user.password"/>
                        <label class="focus-label" for="user_email">Mot de passe</label>
                    </div>
                    <div class="form-group form-focus">
                        <input type="text" id="confirme" class="form-control floating" v-model="user.confirmPassword"/>
                        <label class="focus-label" for="confirme">Confirmation</label>
                    </div>
                    <div class="form-group form-focus">
                        <button type="submit" class="btn btn-primary btn-block btn-lg login-btn">Créer l'utilisateur</button>
                    </div>
                </form>
            </div>
      </div> 
    </div>
</template>

<script>
import { userService } from '@/_services'
export default {
    name: 'useradd',
    data(){
        return {
            user: {
                firstName:'',
                lastName:'',
               // pseudo:'',
                email:'',
                password:'',
               confirmPassword:''
            },
            errors:[]
        }
    },
    methods: {
        ajout(){
            console.log(this.user, this.confirmPassword)

            this.errors = []

            if(this.user.password != this.user.confirmPassword){
                this.errors.push('Le mot de passe saisi doit correspondre avec la confirmation')
            }

            if(this.user.password.length < 6){
                this.errors.push('Le mot de passe doit avoir au moins 6 caractères')
            }

            if(this.errors.length == 0){
                userService.createUser(this.user)
                    .then(res => this.$router.push({name: 'uList'}))
                    .catch(err => console.log(err))
            }
        }
    },
}
</script>

<style>
    
</style>