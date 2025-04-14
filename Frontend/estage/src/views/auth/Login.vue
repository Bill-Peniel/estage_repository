<template>
    <div>
    
	<body class="account-page">

		<HeaderComponent/> 
		<!-- Main Wrapper -->
		<div class="main-wrapper">
			
			<!-- Page Content -->
			<div class="content">
				<div class="container-fluid">
					
					<div class="row">
						<div class="col-md-8 offset-md-2">
							
							<!-- Login Tab Content -->
							<div class="account-content">
								<div class="row align-items-center justify-content-center">
									<div class="col-md-7 col-lg-6 login-left">
										<img src="assets/img/login-banner.png" class="img-fluid" alt="Doccure Login">	
									</div>
									<div class="col-md-12 col-lg-6 login-right">
										<div class="login-header">
											<h3>eStage</h3>
										</div>
										<form @submit.prevent="login">
											<div class="form-group form-focus">
												<input type="email" class="form-control floating" v-model="user.email">
												<label class="focus-label">Email</label>
											</div>
											<div class="form-group form-focus">
												<input type="password" class="form-control floating" v-model="user.password">
												<label class="focus-label">Mot de Passe</label>
											</div>
											<div class="text-right">
												<a class="forgot-link" href="forgot-password.html">Mot de passe oublié ?</a>
											</div>
											<button class="btn btn-primary btn-block btn-lg login-btn bg-[#09dca4]" type="submit">Login</button>											
											<div class="text-center dont-have">Avez - vous un compte ? <router-link to='admin/users/add'>S'enregistrer</router-link></div>
										</form>
									</div>
								</div>
							</div>
							<!-- /Login Tab Content -->
								
						</div>
					</div>

				</div>

			</div>		
			<!-- /Page Content -->

		   
		</div>
		<!-- /Main Wrapper -->
		
	</body>
	<FooterComponent/>
    </div>
</template>

<script>
import HeaderComponent from '@/components/HeaderComponent.vue';
import FooterComponent from '@/components/FooterComponent.vue';
import { accountService } from '@/_services'

export default {
    name : 'Login', 
    data(){
        return {
            user: {
                email: '',
                password: ''
            }
        }
    },
    methods: {
        login(){
            accountService.login(this.user)
                .then(res => {
                    accountService.saveToken(res.data.access_token)
                    this.$router.push('/admin/dashboard')
                })
                .catch(err => console.log(err))
        }
    },
	components:{
		HeaderComponent, FooterComponent
	}
}

</script>

<style>

</style>