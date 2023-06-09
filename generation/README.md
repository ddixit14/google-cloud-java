# Generation

## Using scripts independently

Most of the scripts in this directory can be used independently to do file updates across all modules.
They are also used and tested by `merge_repository.sh`.

## Merge repository into the monorepo

Built by running [merge_repository.sh](merge_repository.sh).

The script creates a new Git repository in `monorepo/google-cloud-java` by merging
the repositories in the input.
After running the script locally, you can `cd` into the generated repository and build the project.

```shell
cd monorepo/google-cloud-java
mvn test -T 1C -B
```

### Input

The file `repos.txt` lists all the split repos to include in the aggregation into the monorepo.

### Output

See: [bootstrap_output](https://github.com/googleapis/google-cloud-java/tree/bootstrap_output) branch.

### Diffs

The workflow also generates a diff between the current `main` branch and the generated aggregation of modules from split repos.
See: `boostrap_outout_diff_{event}` branches.
