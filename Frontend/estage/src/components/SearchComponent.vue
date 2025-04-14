
<template>
    <div>
        <!-- Home Banner -->
			<section class="section section-search">
				<div class="banner-image">
					<img src="/assets/img/homeimg.png" alt="banner" class="responsive-banner">
				</div>
				<div class="container-fluid">
					<div class="banner-wrapper">
						<div class="banner-header text-center">
							<h1 class="text-white responsive-title">Recherches une Structure , Fais une demande de Stage</h1>
							<p class="text-white responsive-text">Découvres la ou le(s) structure(s) en adéquation avec ta formation.</p>
						</div>
                         
						<!-- Search -->
						<!--<div class="search-box">
							<form action="templateshub.net">
								<div class="form-group search-location">
									<input type="text" class="form-control" placeholder="Rechercher un lieu">
									<span class="form-text text-white">Selon votre emplacement</span>
								</div>
								<div class="form-group search-info">
									<input type="text" class="form-control" placeholder="Rechercher Un Ministère">
									<span class="form-text text-white">Ex : Finance ou Ministère de...</span>
								</div>
								<button type="submit" class="btn btn-primary search-btn"><i class="fas fa-search"></i> <span>Search</span></button>
							</form>
						</div> -->
						<!-- /Search -->
						
					</div>
				</div>
			</section>
	<!-- /Home Banner -->
    </div>
</template>

<script>
export default {
    name : 'SearchComponent'
    
}
</script>

<style>
.section-search {
  position: relative;
  padding: 50px 0;
  min-height: 300px;
  background: #f8f9fa;
}

.banner-image {
  width: 100%;
  position: relative;
  overflow: hidden;
}

.banner-wrapper {
  position: relative;
  z-index: 1;
  padding: 30px 0;
}

.responsive-banner {
  width: 100%;
  height: auto;
  display: block;
  object-fit: cover;
}

.responsive-title {
  font-size: 2.5rem;
  margin-bottom: 1rem;
}

.responsive-text {
  font-size: 1.2rem;
  margin-bottom: 2rem;
}

@media (max-width: 992px) {
  .responsive-title {
    font-size: 2rem;
  }
  .responsive-text {
    font-size: 1.1rem;
  }
}

@media (max-width: 768px) {
  .section-search {
    padding: 30px 0;
  }
  .responsive-title {
    font-size: 1.8rem;
  }
  .responsive-text {
    font-size: 1rem;
  }
}

@media (max-width: 480px) {
  .section-search {
    padding: 20px 0;
  }
  .responsive-title {
    font-size: 1.5rem;
  }
  .responsive-text {
    font-size: 0.9rem;
  }
  .banner-wrapper {
    padding: 15px;
  }
}
</style>
