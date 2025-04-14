<template>
    <div>
		<HeadComponent/> 
        <!-- Header -->
			<header class="header">
				<nav class="navbar navbar-expand-lg header-nav">
					<div class="navbar-header">
						<a id="mobile_btn" href="javascript:void(0);">
							<span class="bar-icon">
								<span></span>
								<span></span>
								<span></span>
							</span>
						</a>
						<a href="index-2.html" class="navbar-brand logo">
							<img src="assets/img/finances_bj_logo.png" class="img-fluid" alt="Logo" width="100%">
						</a>
					</div>
					<div class="main-menu-wrapper">
						
						<ul class="main-nav">
							<li>
								<router-link to='/'>Acceuil</router-link>
							</li>
							
                            <li>
								<router-link to='/demande'>Demandes de Stages</router-link>
							</li>
                            <li>
								<a href="admin/statut.html" target="_blank">Statut d'une demande</a>
							</li>
                            <li>
								<a href="admin/contact.html" target="_blank">Contact</a>
							</li>
                            <li>
								<a href="admin/suggestion.html" target="_blank">Suggestion</a>
							</li>							
						</ul>		 
					</div>		 
					<ul class="nav header-navbar-rht">
						<li class="nav-item">
							<a class="nav-link header-login"><router-link to='/login'>Login / S'inscrire</router-link></a>
						</li>
					</ul>
				</nav>
			</header>
		<!-- /Header -->
    </div>
</template>

<script>
import HeadComponent from './HeadComponent.vue';
export default {
  components: { HeadComponent },
    name : 'HeaderComponent'
    
}
</script>

<style>

 .main-nav .router-link-exact-active{
	color: #42b983;
}
</style>