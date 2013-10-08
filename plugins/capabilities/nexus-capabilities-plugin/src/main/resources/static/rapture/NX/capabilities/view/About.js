Ext.define('NX.capabilities.view.About', {
  extend: 'Ext.panel.Panel',
  alias: 'widget.nx-capability-about',

  title: 'About',

  autoScroll: true,
  html: '',

  showAbout: function (about) {
    this.html = about;
    if (this.body) {
      this.body.update(about);
    }
  }

});
