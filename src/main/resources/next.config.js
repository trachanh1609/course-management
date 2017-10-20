module.exports = {
  exportPathMap: function() {
    return {
      '../templates/': { page: '/' },
      '../templates/photo': { page: '/photo' },
      '../templates/profile': { page: '/profile' }
    }
  }
}
