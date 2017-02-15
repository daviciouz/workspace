bird_to_observations = {'canada goose': 5, 'northern fulmar': 1, 'long-tailed jaeger': 2, 'snow goose': 1}

observations_to_birds_list = {}

observations_sorted = sorted(observations_to_birds_list.keys())
for observations in observations_sorted:
    print(observations, ':', '\n')          # end=" "
    for bird in observations_to_birds_list[observations]:
        print(' ', bird, '\n')

