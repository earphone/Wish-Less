Wish Less README Document
------------------------------------------------------------------------------------------------------------
Description:
	Wish Less is a simple app for people to place what they want into lists.
	Then their friends can go and place dibs on items within their lists.
--------------------------------------------------------------------------------------------------------------
TODO
	Login
		implement
			keep logged in
			send to main portion
	Create
		sidebar
			lists
			friends
			wished (for friends)
			settings
		lists ( whole line for each)
			new if empty
			new (maybe popup)
				title
				created
			view (list) (whole line for each) (ability to move items around?)
				new if empty
				new (maybe popup)
					name
					price
					link
					rating of want (1-10 or something simpler "could live without, want, NEED")
					created
				names
					prices
					rating of want
				completed (if true in settings)
		friends (list)
			add
				username
			individual
				lists
					names
					prices
					links
					ratings of want
					dibs?
				wished
		wished
			ongoing
				friend
					name
					price
					rating of want
			completed (if true in settings)
		settings
			friends completed
			lists completed
			show completed lists
			show completed wished
			show completed in list
Test
	send to sign up
Feathers
	Join in on dibs	
--------------------------------------------------------------------------------------------------------------
January 23, 4:14 -+- Higashi -+- First Commit
	Committed this a little later than I should have.
	Finished xml layouts for login and sign up activities.
	On login
		ParseUser checks if the username and password are correct
			if correct then a toast pops up saying congrats
			if incorrect then a toast pops up saying wrong credentials entered
		OnClick for send to sign up added but not tested
	Outline for majority of simple project.