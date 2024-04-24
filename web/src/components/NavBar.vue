<template>
<div class="video-bg">
  <video autoplay muted loop id="myVideo">
    <source src="../assets/didi-home.mp4" type="video/mp4">
  </video>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar w/ text</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
      </ul>
      <span class="navbar-text">
        Navbar text with an inline element
      </span>
    </div>
  </div>
</nav>
</div>
</template>

<script>
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.min.js";
export default {

}
</script>

<style>
.video-bg{
  position: fixed;
  width: 100%;
  height: 100%;
  overflow: hidden;
  z-index: -100;
}

.video-bg:before{
  content: "";
  position: absolute;
  width: 100%;
  height: 100%;
  display: block;
  z-index: -1;
  top: 0;
  left: 0;
  background: rgba(25,29,34,.65);
  background-size: cover;
}

</style>