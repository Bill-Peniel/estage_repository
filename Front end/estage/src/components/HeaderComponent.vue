<template>
	<div>
	  <HeadComponent/>
	  <!-- Header -->
	  <header class="header">
		<nav class="navbar navbar-expand-lg header-nav">
		  <div class="navbar-header">
			<a id="mobile_btn" href="javascript:void(0);" @click="toggleMobileMenu">
			  <span class="bar-icon" :class="{ 'active': isMobileMenuOpen }">
				<span></span>
				<span></span>
				<span></span>
			  </span>
			</a>
			<div style="width: 28px;"></div>
			<a href="javascript:void(0);" class="navbar-brand logo">
			  <img src="assets/img/finances_bj_logo.png" class="img-fluid" alt="Logo">
			</a>
		  </div>
  
		  <div class="main-menu-wrapper" :class="{ 'show-menu': isMobileMenuOpen }">
			<div class="menu-header">
			  <a id="menu_close" class="menu-close" href="javascript:void(0);" @click="toggleMobileMenu">
				<i class="fas fa-times"></i>
			  </a>
			</div>
			<ul class="main-nav">
			  <li>
				<router-link to='/'>Acceuil</router-link>
			  </li>
			  <li>
				<router-link to='/demande'>Demandes de Stages</router-link>
			  </li>
			  <li>
				<router-link to='/login'>Statut d'une demande</router-link>
			  </li>
			  <li>
				<router-link to='/contact'>Contact</router-link>
			  </li>
  
			  <!-- Login/Signup visible seulement en mobile -->
			  <li class="mobile-login-item mobile-only">
				<router-link to='/login' class="mobile-login-link">Login / S'inscrire</router-link>
			  </li>							
			</ul>		 
		  </div>		 
		  
		  <!-- Login/Signup visible seulement en desktop -->
		  <ul class="nav header-navbar-rht desktop-only">
			<li class="nav-item">
			  <a class="nav-link header-login">
				<router-link to='/login'>Login / S'inscrire</router-link>
			  </a>
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
	name: 'HeaderComponent',
	data() {
	  return {
		isMobileMenuOpen: false
	  }
	},
	methods: {
	  toggleMobileMenu() {
		this.isMobileMenuOpen = !this.isMobileMenuOpen;
		if (this.isMobileMenuOpen) {
		  document.body.classList.add('menu-opened');
		} else {
		  document.body.classList.remove('menu-opened');
		}
	  }
	},
	mounted() {
	  // Close menu when clicking outside
	  document.addEventListener('click', (event) => {
		const mainMenuWrapper = document.querySelector('.main-menu-wrapper');
		const mobileBtn = document.getElementById('mobile_btn');
		
		if (this.isMobileMenuOpen && 
			!mainMenuWrapper.contains(event.target) && 
			!mobileBtn.contains(event.target)) {
		  this.toggleMobileMenu();
		}
	  });
  
	  // Close menu on window resize (if screen becomes large)
	  window.addEventListener('resize', () => {
		if (window.innerWidth > 991 && this.isMobileMenuOpen) {
		  this.isMobileMenuOpen = false;
		  document.body.classList.remove('menu-opened');
		}
	  });
	}
  }
  </script>
  
  <style scoped>
  .navbar-brand.logo img {
	max-width: 100%;
	height: auto;
	transition: all 0.3s ease;
  }
  
  .navbar-brand.logo {
	max-width: 180px;
	margin-left: 10px;
  }
  
  .navbar-header {
	display: flex;
	justify-content: flex-start;
  }
  
  /* Affichage conditionnel */
  .desktop-only {
	display: block;
  }
  
  .mobile-only {
	display: none;
  }
  
  /* Cibler le mode mobile */
  @media (max-width: 991px) {
	.desktop-only {
	  display: none !important;
	}
  
	.mobile-only {
	  display: block !important;
	}
  }
  </style>
  