rsBaseApp.config([
  '$stateProvider', '$urlRouterProvider', '$locationProvider', '$httpProvider',
  function ($stateProvider, $urlRouterProvider, $locationProvider, $httpProvider) {

      var access = routingConfig.accessLevels;

      $urlRouterProvider.otherwise("404");

      $urlRouterProvider.when('/', '');
      $urlRouterProvider.when('', '/login');


      $stateProvider
        .state('home', { url: '/', templateUrl: 'views/home/hmFrameCtrl.html', controller: 'hmFrameCtrl', abstract: true, access: [access.anon], friendlyName: 'Home' })
        .state('home.404', { url: '404', templateUrl: 'views/home/rs404Ctrl.html', access: [access.public], hideInMenu: true })
        .state('home.login', { url: 'login', templateUrl: 'views/loginName.html', controller: 'rsAuthLoginCtrl', access: [access.anon], hideInMenu: true })

      $httpProvider.interceptors.push('rsAuthInterceptorFactory');
      $httpProvider.defaults.useXDomain = true;
      delete $httpProvider.defaults.headers.common['X-Requested-With'];

  }]);
