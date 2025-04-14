
<template>
    <div>
        <!-- Home Banner -->
			<section class="section section-search">
				<div class="banner-image">
					<img src="../assets/img/homeimg.png" alt="banner" class="img-fluid">
				</div>
				<div class="container-fluid">
					<div class="banner-wrapper">
						<div class="banner-header text-center">
							<h1 class="text-white">Recherches une Structure , Fais une demande de Stage</h1>
							<p class="text-white">Découvres la ou le(s) structure(s) en adéquation avec ta formation.</p>
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
  min-height: 400px;
  background: #f5f5f5;
  padding: 0;
}

.banner-image {
  position: relative;
  width: 100%;
  height: 100%;
  overflow: hidden;
}

.banner-image img {
  width: 100%;
  height: auto;
  display: block;
  object-fit: cover;
}

@media (max-width: 991px) {
  .section-search {
    min-height: 300px;
  }
}

@media (max-width: 767px) {
  .section-search {
    min-height: 200px;
  }
  
  .banner-image img {
    height: 100%;
    object-position: center;
  }
}
</style>
