<template>
    <div>
<!-- doccure/  30 Nov 2019 04:11:34 GMT -->
	<!-- <HeadComponent/> -->
	<body>

		<!-- Main Wrapper -->
		<div class="main-wrapper">
			
		<SearchComponent/>
		
		<MinistriesComponent/>
      
	   </div>
	   <!-- /Main Wrapper -->
     
	</body>
        
<!-- doccure/  30 Nov 2019 04:11:53 GMT -->
    </div>
</template>

<script>
import MinistriesComponent from './MinistriesComponent';
import SearchComponent from './SearchComponent';

export default {
    name :  "Acceuil",
	components:{	
	    SearchComponent,MinistriesComponent
	}
}
</script>


<style>
</style>