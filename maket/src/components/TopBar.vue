<template>
  <section class="Topbar white-section">
    <div>
      <button class="NavigationBtn" v-on:click="openNavbarPanel">
        <svg
          width="50"
          height="32"
          viewBox="0 0 50 32"
          fill="none"
          xmlns="http://www.w3.org/2000/svg"
        >
          <g clip-path="url(#clip0_101_2)">
            <rect width="40" height="32" fill="#FFFFFF" />
            <rect y="1" width="40" height="6" rx="3" fill="#67748E" />
            <rect y="13" width="40" height="6" rx="3" fill="#67748E" />
            <rect y="25" width="30" height="6" rx="3" fill="#67748E" />
          </g>
          <defs>
            <clipPath id="clip0_101_2">
              <rect width="50" height="32" fill="white" />
            </clipPath>
          </defs>
        </svg>
      </button>
    </div>
    <div class="SearchDiv flex mt5">
      <div class="flex ml20 mt13 mb13">
        <img class="SearchImg" src="../assets/FrameLupa.png" />
      </div>
      <div class="flex mt13 mb13 mr200">
        <input class="Search" placeholder="Search" />
      </div>
    </div>
    <div class="flex">
      <div class="BasketDiv">
        <img class="Basket" src="../assets/IconBasket.png" />
      </div>
      <div class="NotificationDiv">
        <img class="Notification" src="../assets/IconNotification.png" />
      </div>
      <div class="User">
        <div>
          <img class="UserImg" src="../assets/User.jpg" />
        </div>
        <div>
          <h3 class="ml10 mt25">User Name</h3>
        </div>
        <div>
          <img class="ml20 mt33" src="../assets/VectorArrowBottom.png" />
        </div>
      </div>
    </div>
  </section>
</template>
