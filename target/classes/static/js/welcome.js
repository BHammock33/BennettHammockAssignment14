var user = sessionStorage.getItem('user')
			if (user == null){
				let name = prompt("Enter your name")
			while(name === ''|| name === 'null'){
				name = prompt("Enter your name")
			}
			fetch ('/users', {
					method: 'POST',
					body: name
			}).then(response => response.json())
			.then(user => {
				sessionStorage.setItem('user', JSON.stringify(user))
			})
			}else {
			user = JSON.parse(sessionStorage.getItem('user'))
		}