<template>
    <div>
        <section class="section section-specialities" style="background-color: rgb(224, 224, 224);">
				<div class="container-fluid">
                    <div class="row row-cols-1 row-cols-md-2 g-4">
                                    <div class="col">
                                        <div class="card h-100 border-0 shadow p-0 rounded overflow-hidden card-scale">
                                            <div class="card-body p-0">
                                                <div class="d-flex flex-lg-row flex-column-reverse h-100">
                                                    <div class="d-flex flex-column justify-content-end"><img src="assets/img/blue-triangle.svg" alt="" width="75"></div>
                                                    <div class="flex-grow-1 mt-n5 mb-n3 my-lg-5 mx-4 mx-lg-0">
                                                        <h2  class="h4 fw-bold mb-3">Vous avez une suggesstion ?</h2>
                                                        <p class="fw-light mb-4">Merci d'envoyer votre suggestion</p>
                                                        <form action="https://mod.finances.bj/suggestion" method="get" class="footer-form">
                                                            <div class="input-group mb-3">
                                                              <input type="email" name="email" class="form-control" placeholder="Votre Email" aria-label="Votre Email" aria-describedby="suggestion-from-btn">
                                                        <button class="btn btn-primary" type="submit" id="suggestion-from-btn"> Continuer </button></div></form>
                                                    </div>
                                                    <div class="text-end"><img src="assets/img/newsletter-triangle.svg" alt="" width="125"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col"><div class="card h-100 border-0 shadow p-0 rounded overflow-hidden card-scale">
                                        <div class="card-body p-0">
                                            <div class="d-flex flex-lg-row flex-column-reverse h-100">
                                                <div class="d-flex flex-column justify-content-end"><img src="assets/img/green-triangle.png" alt="" width="75"></div>
                                                <div class="flex-grow-1 mt-n5 mb-n3 my-lg-5 mx-4 mx-lg-0">
                                                    <h2 class="h4 fw-bold mb-3">Vous avez une plainte ?</h2>
                                                    <p class="fw-light mb-4">Merci d'envoyer votre plainte</p>
                                                    <form action="https://mod.finances.bj/plainte" method="get" class="footer-form">
                                                        <div class="input-group mb-3"><input type="email" name="email" class="form-control" placeholder="Votre Email" aria-label="Votre Email" aria-describedby="complain-from-btn">
                                                            <button class="btn btn-primary" type="submit" id="complain-from-btn"> Continuer </button>
                                                        </div>
                                                    </form>
                                                </div>
                                                <div class="text-end"><img src="assets/img/emergency-triangle.png" alt="" width="125"></div>
                                            </div>
                                      </div>
                                     </div>
                                 </div>
                        </div>
            </div>
        </section>
        <section class="bg-primary text-white">
                <div  class="d-flex">
                    <div class="w-100" style="height: 5px; background-color: rgb(0, 104, 40);"></div>
                    <div class="w-100" style="height: 5px; background-color: rgb(255, 190, 0);"></div>
                    <div class="w-100" style="height: 5px; background-color: rgb(235, 0, 0);"></div>
                </div>
                <div class="container py-5 fw-light">
                    <div class="row">
                        <div  class="col-md-4 mb-3">© 2023 MEF</div>
                        <div  class="col-md-4 mb-3"><a data-v-b1627372="" class="text-white" aria-current="page" href="/politique-de-confidentialite">Politique de confidentialité</a></div>
                        <div  class="col-md-4 mb-3 text-start text-md-end">
                            <div><a type="button" class="btn btn-outline-secondary border-0 text-white" href="#!"><i class="fa-brands fa-twitter"></i></a><a type="button" class="btn btn-outline-secondary border-0 text-white" href="#!"><i class="fa-brands fa-linkedin"></i></a><!----><!----><a href="mailto:contact@controlefinancier.bj" type="button" class="btn btn-outline-secondary border-0 text-white"><i class="fa-regular fa-envelope"></i></a></div>
                         </div>
                    </div>
                </div>
        </section>
    </div>
</template>

<script>
export default {
    name : 'FooterComponent'
}
</script>

<style>
</style>