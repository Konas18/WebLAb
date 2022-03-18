// макет
https://www.figma.com/file/ljYL6wW2M69AKT4avaH1IK/Sales-Management-Dashboard-(Community)?node-id=8%3A485
<template>
  <div id="app" class="flex">
    <div>
      <Sidebar></Sidebar>
    </div>
    <div>
      <TopBar></TopBar>
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import Sidebar from './components/Sidebar.vue';
import TopBar from './components/TopBar.vue';

@Component({
  components: { Sidebar, TopBar },
})
export default class App extends Vue {}
</script>
<style>
.flex {
  display: flex;
}
.jbf {
  justify-content: space-between;
}
.Logo {
  margin-left: 50px;
  display: flex;
}
.icon {
  max-width: 26px;
  max-height: 26px;
}
.elips {
  max-width: 13px;
  max-height: 13px;
}
.FocusMenuItem {
  margin-left: 10px;
  color: rgb(0, 81, 255);
  background: rgba(111, 178, 255, 0.336);
  border-radius: 8px;
}
.MenuItem {
  margin-left: 10px;
  color: #aeb9be;
  border-radius: 8px;
}
.MainNav {
  margin-top: 30px;
  margin-left: 20px;
  max-width: 230px;
  max-height: 500px;
}
.ServiceNav {
  margin-left: 20px;
  max-width: 230px;
  max-height: 300px;
}
.ml20 {
  margin-left: 20px;
}
.ml10 {
  margin-left: 10px;
}
.ml5 {
  margin-left: 5px;
}
.mt25 {
  margin-top: 25px;
}
.mt13 {
  margin-top: 13px;
}
.blue {
  color: rgb(0, 81, 255);
}
.black {
  color: black;
}
</style>
