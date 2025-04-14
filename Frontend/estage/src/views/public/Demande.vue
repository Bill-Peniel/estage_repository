<template>

	<body class="account-page">

		<!-- Main Wrapper -->
		<div class="main-wrapper">
		
			
			<!-- Page Content -->
	
					
					<div class="container pt-4">
					<h1 class="h2 mb-4 text-center">Demande de Stage</h1>
					<div class="mx-auto mt-4 rogue" style="max-width: 900px;">

						<div class="wrapper-steppy pt-4" id="stepper-wrapper">
                    
                    
                    
                    
                    
                    <div class="steppy">
                            <div class="steppy-progress">
                                <div class="steppy-progress-bar" :style="'width:'+ stepperprogress"></div>
                            </div>
                           
                        <div class="steppy-item " :class="{'current': step == item, 'success' : step > item}"  v-for="(item, index) in 4" :key="index">
                            <div class="steppy-item-counter">
                                <img class="icon-success" src="/assets/img/tick2.svg" alt="Check Mark">
                                <span class="number">
                                    {{ item }}
                                </span>
                            </div>
                            <span class="steppy-item-title">
                                {{infos[item-1]}}
                            </span>
                        </div>
                    </div>
						<div  class="steppy-content">
						<div  class="steppy-pane">
                        <div class="text-start">
                            
                            
                                           
                            <form action="">
                                <div v-if="step === 1">

                                    <div class="mb-3">
                                        <fieldset class="radio fildset">
                                            <label for="txt" class="txt">Quel type de stage voulez vous effectuer ?</label>
                                            <input type="radio" id="one" value="Un" v-model="registration.groupe" @click="removeNew()">
                                            <label for="one">Individuel</label>
                                            <input type="radio" id="two" value="Deux" v-model="registration.groupe" @click="addNew()">
                                            <label for="two">Binôme</label>
                                        </fieldset>                                        
                                    </div>
                                    
                            <div class="accordion" id="accordionExample"   v-for="(item, index) in items" :key="index">
                                <div class="accordion-item mb-2" >
                                <h2 class="accordion-header" >
                                    <button class="accordion-button" type="button" :class="{ 'collapsed': item.isOpen ==true }"  data-bs-toggle="collapse" :data-bs-target="'#accordionExample_'+item.id" :aria-expanded="item.isOpen== true ? true : false"  :aria-controls="'accordionExample_'+item" @click="toggle(item)" >
                                        Stagiaire {{ item.nom }}  {{ item.prenom }} 
                                    </button>
                                </h2>
                                <div :id="'accordionExample_'+item.id" class="accordion-collapse collapse " :class="{ 'show': item.isOpen ==true}" data-bs-parent="#accordionExample" >
                                    <div class="accordion-body">
                                    
                                    <div class="mb-3">
                                        <div class="change-avatar">
                                            <div class="profile-img">
                                                <img src="assets/img/patients/patient.jpg" alt="User Image">
                                            </div>
                                            <div class="upload-img">
                                                <div class="change-photo-btn">
                                                    <span><i class="fa fa-upload"></i> Uploader Photo</span>
                                                    <input type="file" class="upload">
                                                </div>
                                                <small class="form-text text-muted">Extension JPG, GIF or PNG. Taille Max of 2MB</small>
                                            </div>
                                        </div>
                                    </div>
													
                                    <div class="mb-3">
                                        <label for="firstName" class="form-label fw-bold">Nom *</label>
                                            <input 
                                            type="text"
                                            name="firstName"
                                            id="firstName"
                                            class="form-control"
                                            v-model="item.nom"
                                            placeholder required
                                            >
                                      
                                    </div>
                                    <div class="mb-3">
                                        <label for="lastName" class="form-label fw-bold">Prénom * </label>                                      
                                            <input 
                                            type="text"
                                            name="lastName"
                                            id="lastName"
                                            class="form-control"
                                            v-model="item.prenom"
                                            >                                     
                                    </div>
                                    <div class="mb-3">
                                        <label for="sexe" class="form-label fw-bold">Sexe *</label>
                                        <select class="form-select" id="sexe" v-model="items[0].sexe" required>
                                            <option value="">Sélectionner votre sexe</option>
                                            <option value="Masculin">Masculin</option>
                                            <option value="Féminin">Féminin</option>
                                        </select>
                                    </div>

                                    <div class="mb-3">
                                        <label for="dateNais" class="form-label fw-bold">Date de Naissance * </label>   
                                        <div>
                                            <input 
                                            type="date"
                                            name="dateNais"
                                            id="dateNais"
                                            class="form-control"
                                            v-model="item.dateNais"
                                            >    
                                        </div>                                                                        
                                    </div>
                                    <div class="mb-3">
                                        <label for="nationalite" class="form-label fw-bold">Nationalité *</label>
                                            <input 
                                            type="text"
                                            name="nationalite"
                                            id="nationalite"
                                            class="form-control"
                                            v-model="item.nationalite"
                                            placeholder required
                                            >                                      
                                    </div>                                 
                                    <div class="mb-3">
                                        <label for="email" class="form-label fw-bold">Email *</label>
                                            <input 
                                            type="text"
                                            name="email"
                                            id="email"
                                            class="form-control"
                                            v-model="item.email"
                                            placeholder required
                                            >
                                      
                                    </div>
                                    <div class="mb-3">
                                        <label for="tel" class="form-label fw-bold">Tél * </label>                                      
                                            <input 
                                            type="text"
                                            name="tel"
                                            id="tel"
                                            class="form-control"
                                            v-model="item.tel"
                                            >                                     
                                    </div>

                                    </div>
                                    </div>
                                    </div>
                                </div>
  
                                    <!-- <div class="text-center">
                                        <button class="btn btn-primary btn-light-blue" type="button" @click="accordion()">
                                        <i class="fa fa-plus"></i> 
                                        Ajouter un autre candidat
                                        </button>
                                     </div> -->
                                   
                                    <div class="stepper-controls d-flex justify-content-between mt-5">
                                        <button  class="btn btn-sm btn-primary btn-left" disabled @click.prevent="prev()">Précedent</button>
                                        <button  class="btn btn-sm btn-primary btn-light-blue"  @click.prevent="next()">Suivant</button>
                                    </div>
                                   
                                </div>

                                <div v-if="step === 2">
                                    <div class="mb-3">
                                        <label for="typestage" class="form-label fw-bold">Type de Stage * </label>                                      
                                        <select class="form-select" id="typeStage" v-model="registration.typeStage" required>
                                            <option value="">Sélectionner le type de Stage</option>
                                            <option title="PRMP" value="Académique">Académique</option>
                                            <option title="DSI" value="Professionnel">Professionnel</option></select>                                   
                                    </div>
                                   
                                    <div class="mb-3">
                                        <label for="etablissement" class="form-label fw-bold">Université *</label>
                                            <input 
                                            type="text"
                                            name="etablissement"
                                            id="etablissement"
                                            class="form-control"
                                             v-model="registration.university"
                                            placeholder required
                                            >
                                      
                                    </div>

                                    
                                    <div class="mb-3">
                                        <label for="durée" class="form-label fw-bold">Filière *</label>
                                            <input 
                                            type="text"
                                            name="durée"
                                            id="durée"
                                            class="form-control"
                                            v-model="registration.filiere"
                                            placeholder required
                                            >
                                      
                                    </div>

                                    <div class="mb-3">
                                        <label for="durée" class="form-label fw-bold">Durée de stage *</label>
                                            <input 
                                            type="text"
                                            name="durée"
                                            id="durée"
                                            class="form-control"
                                            v-model="registration.duration"
                                            placeholder required
                                            >
                                      
                                    </div>
                                    
                                
                                
                                    <div class="stepper-controls d-flex justify-content-between mt-5">
                                        <button  class="btn btn-sm btn-primary btn-left"  @click.prevent="prev()">Précedent</button>
                                        <button  class="btn btn-sm btn-primary btn-right"  @click.prevent="next()">Suivant</button>
                                    </div>

                                </div>

                                <div v-if="step === 3">
                                    
                                    <div class="upload-box">
                                        <p> Veuillez joindre votre CV et votre lettre de motivation </p>
                                        <form>
                                            <input type="file" class="file-imput" ref="fileinput"  @change="uploadfile" hidden/>
                                            <div class="icon" @click="$refs.fileinput.click()">
                                                <img src="assets/img/upload.jpg" />
                                            </div>
                                            <p>Parcourir ...</p>
                                        </form>                                    
                                    <section class="loading-area" v-if="showProgress">
                                        <li class="rows" v-for="(file, index) in files" :key="index">
                                            <i class="fas fa-file-alt"> </i>
                                                <div class="contents">
                                                    <div class="details">
                                                        <span class="name">{{file.name}}</span>
                                                        <span class="percent">{{file.loading}}</span>                                                      
                                                    </div>
                                                    <div class="loading-bar">
                                                        <div class="loading" :style="{width : file.loading + '%'}"></div>
                                                    </div>
                                                </div>                                           
                                        </li>
                                    </section>
                                    <section class="uploaded-area">
                                        <li class="rows" v-for="(file, index) in uploadFiles" :key="index">
                                            <div class="contents upload">
                                                <i class="fa fa-file-alt" aria-hidden="true"> </i>
                                                <div class="details">
                                                    <span class="name">{{file.name}}</span>
                                                    <span class="size">{{file.size}}</span>  
                                                </div>
                                            </div>
                                           <div class="valid upolad">
                                                <!-- <i class="fa fa-check" aria-hidden="true"> </i> -->
                                                <span class="delete" @click="deleteFile(index)">&times;</span>
                                           </div>

                                            
                                            <!-- <button class="btn btn-danger btn-sm rounded-0" type="button" data-toggle="tooltip" data-placement="top" title="Delete">Retirer</button> -->
                                        </li>
                                    </section>
                                </div>
                                    <!-- <div class="mb-3">
                                        <label for="files" class="form-label fw-bold">Pièces Jointes *</label>
                                        <div  class="rounded text-black-50">
                                            <div class="bg-gray-200 bg-opacity-25 py-2">
                                                <div class="bg-white p-5 text-center rounded drop-shadow file-drop-area">
                                                    <div tabindex="0" class="py-2">
                                                        <input  multiple="" style="display: none;" type="file" autocomplete="off" tabindex="-1">
                                                        <div> Glissez et déposez des fichiers ici, ou cliquez pour sélectionner des fichiers. 
                                                            <div class="text-center">
                                                            <button class="btn btn-sm btn-primary mt-5" type="button"> 
                                                                Sélectionner un fichier
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row g-2"></div>
                                    </div> -->
                                   
                                    

                                    <div class="stepper-controls d-flex justify-content-between mt-5">
                                        <button  class="btn btn-sm btn-primary btn-left"  @click.prevent="prev()">Précedent</button>
                                        <button  class="btn btn-sm btn-primary btn-right"  @click.prevent="next()">Suivant</button>
                                    </div>
                                    
                                </div>

                                <div v-if="step === 4">
                                    <h1>Résumé des Informations</h1>
                                    
                                    <div class="mb-3">
                                        <legend>Type de Stage :</legend>
                                        <p>{{ gatheredInfo.groupe }}</p>
                                    </div>

                                    <div v-for="(stagiaire, index) in gatheredInfo.stagiaires" :key="index">
                                        <h3>Stagiaire {{ index + 1 }}</h3>
                                        <p>Nom : {{ stagiaire.nom }}</p>
                                        <p>Prénom : {{ stagiaire.prenom }}</p>
                                        <p>Email : {{ stagiaire.email }}</p>
                                        <p>Tél : {{ stagiaire.tel }}</p>
                                        <p>Sexe : {{ stagiaire.sexe }}</p>
                                        <p>Date de Naissance : {{ stagiaire.dateNais }}</p>
                                        <p>Nationalité : {{ stagiaire.nationalite }}</p>
                                    </div>

                                    <div class="mb-3">
                                        <legend>Type de Stage :</legend>
                                        <p>{{ gatheredInfo.typeStage }}</p>
                                    </div>

                                    <div class="mb-3">
                                        <legend>Université :</legend>
                                        <p>{{ gatheredInfo.university }}</p>
                                    </div>

                                    <div class="mb-3">
                                        <legend>Filière :</legend>
                                        <p>{{ gatheredInfo.filiere }}</p>
                                    </div>

                                    <div class="mb-3">
                                        <legend>Durée de Stage :</legend>
                                        <p>{{ gatheredInfo.duration }}</p>
                                    </div>

                                    <div class="stepper-controls d-flex justify-content-between mt-5">
                                        <button class="btn btn-sm btn-primary btn-left" @click.prevent="prev()">Précedent</button><button type="submit" class="btn btn-sm btn-primary btn-right" @click.prevent="submit()">Soumettre</button>
                                    </div>
                                </div>

                                </form>
                            </div>
						</div>
						</div>
					</div>	
					</div>
			

			</div>		
			<!-- /Page Content -->
		   
		</div>
		<!-- /Main Wrapper -->
		
	</body>
</template>

<script>
import axios from '@/_services/caller.service'

export default {
  name: 'Demande', 
  data: () => ({
    step: 1,
    files: [],
    uploadFiles: [],
    showProgress: false,
    items: [
      {
        id: 1,
        nom: '',
        prenom: '',
        email: '',
        tel: '',
        sexe: '',
        dateNais: '',
        nationalite: '',
        isOpen: true
      }
    ],
    registration: {
      groupe: '',
      typeStage: '',
      university: '',
      filiere: '',
      duration: ''
    },
    gatheredInfo: {},
    infos: ['Informations Personnelles', 'Informations sur le Stage', 'Pièces Jointes', 'Résumé']
  }),
  methods: {
    prev() {
      this.step--;
    },
    next() {
      if (this.step === 3) {
        this.gatherInfo();  // Appelle la méthode de collecte à la fin de l'étape 3
      }
      this.step++;
    },
    addNew: function () {
      if (this.items.length < 2) {
        this.items.push({
          id: 2,
          nom: '',
          prenom: '',
          email: '',
          tel: '',
          sexe: '',
          dateNais: '',
          nationalite: '',
          isOpen: !this.items[0].isOpen
        });
      }
    },
    removeNew: function () {
      if (this.items.length == 2) {
        this.items.splice(length - 1, 1);
      }
    },
    toggle(item) {
      item.isOpen = !item.isOpen;
    },
    uploadfile(event) {
      const file = event.target.files[0];
      if (!file) return;
      const fileName = (file.name.length >= 12) ? file.name.substring(0, 13) + '....' + file.name.split('.')[1] : file.name;
      const formData = new FormData();
      formData.append("file", file);
      this.files.push({ name: fileName, loading: 0 });
      this.showProgress = true;

      axios.post('/upload', formData, {
        onUploadProgress: ({ loaded, total }) => {
          this.files[this.files.length - 1].loading = Math.floor((loaded / total) * 100);
          if (loaded == total) {
            const fileSize = (total < 1024) ? total + 'KB' : (loaded / (1024 * 1024)).toFixed(2) + 'MB';
            this.uploadFiles.push({ name: fileName, size: fileSize });
            this.files = [];
            this.showProgress = false;
          }
        },
      }).catch(console.error);
    },
    deleteFile(index) {
      this.uploadFiles.splice(index, 1);
    },
    gatherInfo() {
      // Récupération des informations des étapes précédentes
      this.gatheredInfo = {
        groupe: this.registration.groupe === 'Un' ? 'Individuel' : 'Binôme',
        stagiaires: this.items.map(item => ({
          nom: item.nom,
          prenom: item.prenom,
          email: item.email,
          tel: item.tel,
          sexe: this.items[0].sexe,
          dateNais: item.dateNais,
          nationalite: item.nationalite
        })),
        typeStage: this.registration.typeStage,
        university: this.registration.university,
        filiere: this.registration.filiere,
        duration: this.registration.duration
      };
    },
    submit() {
      alert('This is the post. Blah');
    }
  },
  computed: {
    stepperprogress() {
      return (100 / 3) * (this.step - 1) + '%';
    }
  }
}
</script>

<style >
 @import '@/assets/style/demande.css'; 
/* @import '@/assets/css/bootstrap.min.css'; */
</style>

